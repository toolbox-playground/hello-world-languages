# Contributing to This Project

First off, thank you for considering contributing to this project. It's people like you that make this project such a great tool.

## How Can I Contribute?

### Reporting Bugs

This section guides you through submitting a bug report for this project. Following these guidelines helps maintainers and the community understand your report, reproduce the behavior, and find related reports.

- Use a clear and descriptive title for the issue to identify the problem.
- Describe the exact steps which reproduce the problem in as many details as possible.
- Provide specific examples to demonstrate the steps.

### Suggesting Enhancements

This section guides you through submitting an enhancement suggestion for this project, including completely new features and minor improvements to existing functionality. Following these guidelines helps maintainers and the community understand your suggestion and make decisions.

- Use a clear and descriptive title for the issue to identify the suggestion.
- Provide a step-by-step description of the suggested enhancement in as many details as possible.
- Provide specific examples to demonstrate the steps.

### Your First Code Contribution

Unsure where to begin contributing to this project? You can start by looking through these `beginner` and `help-wanted` issues:

- `Beginner issues` - issues which should only require a few lines of code, and a test or two.
- `Help wanted issues` - issues which should be a bit more involved than `beginner` issues.

### Pull Requests

- Fill in the required template
- Do not include issue numbers in the PR title
- Include screenshots and animated GIFs in your pull request whenever possible.
- End all files with a newline

## Styleguides

### Git Commit Messages

- Use the present tense ("Add feature" not "Added feature")
- Use the imperative mood ("Move cursor to..." not "Moves cursor to...")
- Limit the first line to 72 characters or less
- Reference issues and pull requests liberally after the first line

### Terraform Style Guide

All Terraform code must adhere to the following style guidelines:

- Use 2 spaces for indentation.
- Use snake_case for all names (resources, data sources, variables, outputs).
- Use `{}` for empty blocks instead of `null`.
- Use `//` for single-line comments.
- Use `/* ... */` for multi-line comments.
- Use descriptive names for resources, variables, outputs.
- Group and order `variable` and `output` blocks logically.
- Use inline comments sparingly.
- Use version pinning for providers.
- Use locals for intermediate values.
- Use `_` as the name for unused resources.
- Use `terraform fmt` to automatically format your code to match the Terraform language style conventions.

For more detailed information, please refer to the [Terraform Style Guide](https://www.terraform.io/docs/language/syntax/style.html).

### Documentation Styleguide

- Use [Markdown](https://daringfireball.net/projects/markdown).